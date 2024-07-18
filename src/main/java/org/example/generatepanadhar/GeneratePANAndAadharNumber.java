package org.example.generatepanadhar;

import java.util.Scanner;

public class GeneratePANAndAadharNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String PANNO = null;
        String aadharNo = null;

        String personName = scan.nextLine();
        Integer age = scan.nextInt();
        Long mobileNo = scan.nextLong();

        Person person = new Person(personName, age, mobileNo);

        if (validate(person)) {
            PANNO = generatePANNumber(person);
            aadharNo = generateAadharNumber(person);
            System.out.println("Success: Your PAN Number is:" + PANNO + " and Aadhar Number is:" + aadharNo + ".");

        } else {
            System.out.println("Error: Your PAN and Aadhar Number can't be generated.");
            scan.close();
        }
    }

    public static boolean validate(Person person) {

        String name = person.getName();
        //String regex = "[A-Z][a-z]*\\s[A-Z][a-z]*";
        String regex = "([A-Z][a-z]*|[A-Z])\\s?([A-Z][a-z]*|[A-Z])?";
        if (name.isEmpty() || name.isBlank()) {
            return false;
        }
        if (!name.matches(regex)) {
            return false;
        }
        Integer age = person.getAge();
        if (age < 17 || age > 59) {
            return false;
        }

        Long mobileNo = person.getMobileNo();
        String strMobileNo = String.valueOf(mobileNo);
        if (strMobileNo.length() < 10) {
            return false;
        }
        char firstDigit = strMobileNo.charAt(0);
        for (int i = 1; i < strMobileNo.length(); i++) {
            if (strMobileNo.charAt(i) == firstDigit) {
                return false;
            }
        }

        return true;
    }

    public static String generateAadharNumber(Person person) {
        String stringAge = String.valueOf(person.getAge());
        return "1234" + " " + stringAge + stringAge + " " + "9876";

    }

    public static String generatePANNumber(Person person) {

        String name = person.getName();
        Integer age = person.getAge();
        String stringAge = String.valueOf(age);
        String updatedName = name.replaceAll("\\s", "").toUpperCase();
        if (updatedName.length() >= 6) {
            String firstFiveChars = updatedName.substring(0, 5).toUpperCase();
            String ageTwice = stringAge + stringAge;
            String sixthChar = String.valueOf(updatedName.charAt(5)).toUpperCase();
            return firstFiveChars + ageTwice + sixthChar;

        } else {
            String requiredAs = "A".repeat(6 - updatedName.length());
            String ageTwice = stringAge + stringAge;
            return updatedName + requiredAs + ageTwice + "Z";
        }

    }


}

class Person {
    private String name;
    private Integer age;
    private Long mobileNo;

    public Person(String name, Integer age, Long mobileNo) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }
}
