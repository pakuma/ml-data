package com.mywork;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.util.Scanner;

public class WordCountApp {
    //******************* For Code Testing ********************
    static {
        Scanner scanner = new Scanner(System.in);
        String[] fileDetails = new String[2];
        System.out.println("Input File Path : ");
        fileDetails[0] = scanner.nextLine();
        System.out.println("Output File Path : ");
        fileDetails[1] = scanner.nextLine();
        try {
            WordCountApp.main(fileDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //******************* For Code Testing ********************
    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.err.println("Invalid");
            System.err.println("Word <in> <out>");
            System.exit(0);
        }
        Configuration configuration = new Configuration();

        Job job = new Job(configuration, "wordcount");
        job.setJarByClass(WordCountApp.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        job.setMapperClass(WordCountMapper.class);
        job.setReducerClass(WordCountReducer.class);

        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}
