package assessment;
import java.util.*;
public class Anagram {
    public static List<List<String>> groupAnagram(String[] string){
    	HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        
        for(String str:string) {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)) {
                map.get(key).add(str);
            }
            else {
                List<String> stringList=new ArrayList<>();
                stringList.add(str);
                map.put(key, stringList);
            }
        }
        res.addAll(map.values());
        return res;
    }
    public static void main(String[] args) {
        String[] string= {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=groupAnagram(string);
        result.forEach(res->System.out.println(res+""));
    }
}

