class PartitionString {
    public List<String> partitionString(String s) {
        List<String> segment = new ArrayList<>();
        Set<String> seen = new HashSet<>();
         StringBuilder temp = new StringBuilder();
        for(int i=0;i<s.length();i++){
             temp.append(s.charAt(i));
             String current = temp.toString();
            if(!seen.contains(current)){
                seen.add(current);
                segment.add(current);
                temp.setLength(0);
            }
        }
        return segment;
    }
}