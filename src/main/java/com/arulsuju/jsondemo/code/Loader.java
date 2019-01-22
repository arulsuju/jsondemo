package com.arulsuju.jsondemo.code;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Loader {

    public static void main(String args[])throws Exception
    {
        ObjectMapper mapper=new ObjectMapper();
        Student student=mapper.readValue(new File("data/Student.json"),Student.class);
        System.out.println(student.getName());

    }
}
