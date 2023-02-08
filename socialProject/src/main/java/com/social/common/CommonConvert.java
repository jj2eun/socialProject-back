package com.social.common;

import org.apache.commons.lang3.StringUtils;

/*
 * StringUtils 클래스만으로 거의 대부분의 문자열 처리를 수행.
   - 파라미터 값으로 null을 주더라도 절대 NullPointException을 발생시키지 않음.
 * */
public class CommonConvert {

    //null값을 "" 으로 반환
    public static String CommonGetStr(Object str){
        String result ="";
        if (str != null) {
            result = (StringUtils.isEmpty(String.valueOf(str)) ? "" : String.valueOf(str));
        }
        return result;
    }

    //null값을 "0" 으로 반환
    public static String CommonGetSeq(Object str) {
        String result = "0";
        if(str !=null) {
            result = (StringUtils.isEmpty(String.valueOf(str)) ? "0" :String.valueOf(str));
        }
        return result;
    }

    // date 값 yyyy-mm-dd로 반환
    private static String CoomonGetDate(Object o) {
        String toO = "";
        String returnVal = "";
        try {
            toO = o.toString();
            toO = toO.replace("-", "");
            returnVal = toO.substring(0, 4) + "-" + toO.substring(4, 6) + "-" + toO.substring(6, 8);
        } catch (Exception ex) {
            returnVal = "";
        }
        return returnVal;
    }
}
