package LDPJava1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Assignment12
{

    public static void main(String[] args)
    {
        List<Data> alist = new ArrayList<>();
        alist.add(new Data(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        alist.add(new Data(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        alist.add(new Data(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        alist.add(new Data(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        alist.add(new Data(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        alist.add(new Data(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        alist.add(new Data(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        alist.add(new Data(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        alist.add(new Data(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        alist.add(new Data(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        alist.add(new Data(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        alist.add(new Data(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        alist.add(new Data(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        alist.add(new Data(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        alist.add(new Data(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        alist.add(new Data(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        alist.add(new Data(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        List<String> allDepts=alist.stream().map(s->s.department).distinct().collect(Collectors.toList());
        System.out.println(allDepts);
        System.out.println();

        List<String> after2018 = alist.stream().filter(s->s.year>2018).map(s->s.name).distinct().collect(Collectors.toList());
        System.out.println(after2018);
        System.out.println();

        List<String> malecse = alist.stream().filter(s->s.department.equals("Computer Science") && s.gender.equals("Male")).map(s->s.name).distinct().collect(Collectors.toList());
        System.out.println(malecse);
        System.out.println();

        long males= alist.stream().filter(s->s.gender.equals("Male")).count();
        long females= alist.stream().filter(s->s.gender.equals("Female")).count();
        System.out.println(males + " " + females);
        System.out.println();

        float agemales= alist.stream().filter(s->s.gender.equals("Male")).map(s->s.age).reduce(0,(sum,age)->sum+age);
        float agefemales= alist.stream().filter(s->s.gender.equals("Female")).map(s->s.age).reduce(0,(sum,age)->sum+age);
        System.out.println("Average age of males =" + agemales/males + " and average age of females = " + agefemales/females);
        System.out.println();

        Data stMax=alist.stream().max((s1,s2)->s1.perTillDate>s2.perTillDate?1:-1).get();
        System.out.println(stMax.name+" "+stMax.perTillDate);
        System.out.println();

        Map<String,Long> studdept = alist.stream().collect(Collectors.groupingBy(Data::getDepartment,Collectors.counting()));
        studdept.forEach((key,value)->
        {
            System.out.println(key+" "+value);
        });
        System.out.println();

        Map<String,Double> avgDepts = alist.stream().collect(Collectors.groupingBy(Data::getDepartment,Collectors.averagingDouble(s->s.getPerTillDate())));
        avgDepts.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
        System.out.println();

        List<Data> malesElec = alist.stream().filter(s->s.department.equals("Electronic") && s.gender.equals("Male")).collect(Collectors.toList());
        Data youngElecMale = malesElec.stream().min((s1,s2)->s1.age>s2.age?1:-1).get();
        System.out.println("Younghest Male Student in Electronic Department: "+youngElecMale.name+", Age: "+youngElecMale.age);
        System.out.println();

        long malescse = alist.stream().filter(s->s.gender.equals("Male") && s.department.equals("Computer Science")).count();
        long femalescse = alist.stream().filter(s->s.gender.equals("Female") && s.department.equals("Computer Science")).count();
        System.out.println("No of males in CSE department = " + malescse + " and no of females in CSE department = " + femalescse);


    }


}

class Data
{
    int id , age , year;
    String name , gender , department;
    double perTillDate;

    public Data(int id , String name, int age ,String gender ,String department ,int year,
    double perTillDate)
    {
        this.id = id;
        this.age = age;
        this.year = year;
        this.name = name;
        this.gender = gender;
        this.perTillDate = perTillDate;
        this.department = department;

    }

    public String getDepartment()
    {
        return this.department;
    }
    public double getPerTillDate()
    {
        return this.perTillDate;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }


}
