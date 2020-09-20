import os
import sys

os.environ['SPARK_HOME'] = "/usr/local/spark/spark-3.0.0-bin-hadoop2.7"
sys.path.append("/usr/local/spark/spark-3.0.0-bin-hadoop2.7/python/lib/pyspark.zip/pyspark")

from pyspark.sql import SparkSession

spark = SparkSession.builder.appName("People Example").getOrCreate()
# peopleDF = spark.read.format("csv").option("header", "true") \
#    .load("/home/parveen/newland/data/people.csv")
# peopleDF.show()
# peopleDF.select("name", "age").show()
peopleJSON = spark.read.format("csv").option("header", "true")\
    .load("/home/parveen/newland/data/people.csv", sep=";", inferschema="true")
peopleJSON.show()
peopleJSON.write.save("/home/parveen/newland/data/people_check.json", format="json")
# peopleDF.printSchema()
