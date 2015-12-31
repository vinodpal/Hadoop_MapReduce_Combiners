package com.combiner;
import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
public class WordCountMapper extends Mapper<LongWritable,Text,Text,IntWritable>
{
public void map(LongWritable k,Text v,Context con)throws IOException,InterruptedException
{
String line=v.toString();
String words[]=line.split(" ");
for(String s:words)
con.write(new Text(s), new IntWritable(1));	
}
}
