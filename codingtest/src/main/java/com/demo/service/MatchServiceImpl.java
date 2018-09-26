package com.demo.service;

import com.demo.util.MatchResponse;
import com.demo.util.MatchResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service("matchService")
public class MatchServiceImpl implements MatchService {

    @Resource
    MatchResult matchResult;
    @Resource
    MatchResponse matchResponse;
    List<MatchResponse> list = null;
    int count;

    public void PunctuationMatch(String tempString){
        int tempCount = count;
        Pattern pattern = Pattern.compile("[/./?!]+");
        Matcher matcher = pattern.matcher(tempString);
        while(tempCount > 0){
            MatchResponse temp = list.get(list.size() - tempCount--);
            if(matcher.find()){
                count--;
                temp.setIn_sentence(temp.getIn_sentence() + tempString.substring(0, matcher.end()));
            } else {
                temp.setIn_sentence(temp.getIn_sentence() + tempString.substring(0) + " ");
            }
        }
    }


    @Override
    public MatchResult getMatchResultByString(String word) {

        String filename = "G:\\git\\codingtest\\src\\main\\resources\\king-i.txt";
        File file = new File(filename);
        BufferedReader reader = null;
        list = new ArrayList<>();
        count = 0;


        try{
            Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
            reader = new BufferedReader(new FileReader(file), 10 *1024*1024);
            String tempString = null;
            int line = 0;
            while((tempString = reader.readLine()) != null){
                line++;
                int start = 0;
                int end = 0;
                if(count > 0){
                    PunctuationMatch(tempString);
                }

                Matcher matcher = pattern.matcher(tempString);
                while(matcher.find()){
                    start = matcher.start();
                    count++;
                    end = start + word.length();
                    matchResponse = new MatchResponse();
                    matchResponse.setStart(start + 1);
                    matchResponse.setEnd(end + 1);
                    matchResponse.setLine(line);
                    matchResponse.setIn_sentence(word);
                    list.add(matchResponse);
                    PunctuationMatch(tempString.substring(end));
                }
            }
            matchResult.setNumber_of_occurrences(list.size());
            matchResult.setQuery_text(word);
            matchResult.setOccurrences(list);
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("Fail to read file or the search word is not correct!");
        } finally {
            if(reader != null){
                try{
                    reader.close();
                } catch(IOException e){
                    e.printStackTrace();
                    System.out.println("Closing file is fail!");
                }
            }
        }
        return matchResult;
    }
}
