package com.combiner;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer extends Reducer<Text,IntWritable,Text,IntWritable>
{
public void reduce(Text k,Iterable<IntWritable> v,Context con)throws IOException,InterruptedException
{
	int i=0;
	for(IntWritable c:v)
	{
	i=i+c.get();
	}
	con.write(k,new IntWritable(i));
}
}

