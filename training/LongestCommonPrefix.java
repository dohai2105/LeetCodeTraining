

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int sortestStringIndex = 0;
        int sortestStringLength = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++){
           if(strs[i].length()<sortestStringLength){
               sortestStringLength = strs[i].length();
               sortestStringIndex = i;
           }
        }
        String sortestString = strs[sortestStringIndex];
        
        for(int i=0; i<strs.length; i++){
            while(sortestStringLength > 0){
                if(strs[i].indexOf(sortestString)!=0) {
                    sortestString = sortestString.substring(0, sortestString.length()-1);
                } else {
                    break;
                }
            }
            if(sortestString.length() == 0) break;
            if(i == sortestStringIndex) continue;
        }
        return sortestString;
    }

    public static void main(String []args){
        String rs = longestCommonPrefix(new String[]{"flow123","flow","flight"});
        System.out.println(rs);
    }
}
