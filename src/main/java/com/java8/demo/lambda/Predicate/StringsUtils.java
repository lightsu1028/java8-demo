package com.java8.demo.lambda.Predicate;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Baikang Lu
 * @date 2018/11/26
 */
public class StringsUtils {
    public static List<String> filterStrings(List<String> sourceString, Predicate<String> filterCondition){
        List<String> resultStrings = new ArrayList<>();
        for(String str:sourceString){
            if(filterCondition.test(str)){
                resultStrings.add(str);
            }
        }
        return resultStrings;
    }

    public static void main(String[] args) {
        String[] stringArray = new String[]{"", "abcv", "x"};
        List<String> stringList = Arrays.asList(stringArray);
       //过滤空字符串
        List<String> strings = StringsUtils.filterStrings(stringList, (String s) -> !s.isEmpty());
        System.out.println(strings.toString());
        //过滤字符小于3个
        List<String> strings1 = StringsUtils.filterStrings(stringList, (String s) -> s.length() > 3);
        System.out.println(strings1);
    }
}
