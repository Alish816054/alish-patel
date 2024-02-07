class stringmethod
{
    public static void main(String[] args) {
   

        String name = new String("alish patel");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(4));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace("alish","harry"));
        System.out.println(name.startsWith("ali"));
        System.out.println(name.endsWith("l"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("h"));
        System.out.println(name.indexOf("a",3));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf("i",5));
        System.out.println(name.equals("alish patel"));
        System.out.println(name.equalsIgnoreCase("ALISH patel"));
        
    }
}       