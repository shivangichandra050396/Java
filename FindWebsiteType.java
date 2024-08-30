class FindWebSiteType
{
public static void main(String[] s)
{
Scanner sc=new Scanner(System.in)
String enteredString=sc.nextLine();
String protocol=enteredString.subString(0, enteredString.indexOf(":"));
if(protocol="http")
  System.out.println("HTTP");
else if(protocol="https")
  System.out.println("HTTPS");
else
  System.out.println("Invalid");
String type=enteredString.subString(enteredString.lastIndexOf(".")+1);
if(ext.equals("com"))
            System.out.println("Commercial");
else if(ext.equals("org"))
            System.out.println("Organisation");
else if(ext.equals("net"))
            System.out.println("Network");
}
}


