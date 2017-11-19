public class ClassDemo {
    public static void main(String[] args) {
        Person javi = new Person();
        javi.setName("javier");
        javi.setAge(19);
        System.out.println("Javi's real name is " + javi.getName() + " and he's " + javi.getAge());
        Person pat = new Person("patrick", 19);
        System.out.println("Pat's real name is " + pat.getName() + " and he's " + pat.getAge());

        if (javi.getName().equals(pat.getName()) && javi.getAge() == pat.getAge()) {
            System.out.println("they have the same name and age");
        }else{
            System.out.println("they dont have the same name and age");
        }if(javi.getName().equals(pat.getName())) {
            System.out.println("they have the same name");
        }else{
            System.out.println("they don't have the same name");
        }if(javi.getAge() == pat.getAge()) {
                System.out.println("they have the same age");
        }else{
                System.out.println("they don't have the same age");
        }

        }
    }

