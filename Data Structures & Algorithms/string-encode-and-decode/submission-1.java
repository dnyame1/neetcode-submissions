class Solution {

    public String encode(List<String> strs) {
    String encoded_string = "";
    for (int i = 0; i < strs.size(); i++) {
        encoded_string += strs.get(i).length() + "#" + strs.get(i);
    }
    return encoded_string;
}

    public List<String> decode(String str) {
        List<String> result = new ArrayList<String>();
        int i = 0;
        while (i < str.length()){
            int j = str.indexOf('#', i);
            int n = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + n));
            i = j + 1 + n;
        }
        return result;
    }
}

