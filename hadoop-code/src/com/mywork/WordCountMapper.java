package com.mywork;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

import java.io.IOException;
/**
 * LongWritable is hadoop type similar to Java long
 * Text is hadoop type similar to Java String
 * IntWritable is hadoop type similar to Java Int
 *
 * */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
    /**
     * Override map method to provide custom implementation
     * map method requires key, value pair and context to store input/output
     * */
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        //super.map(key, value, context);
        String l = value.toString();
        for(String w : l.split(" ")){
            if(w.length() > 0){
                context.write(new Text(w), new IntWritable(1));
            }
        }
    }
}
