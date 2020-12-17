# Spark 3.0 setting on Linux/Ubuntu

#### Extract Spark binaries to following location

`/usr/local/spark`

#### And Set this location as 

`SPARK_HOME=/usr/local/spark`

#### Spark Setting file

`sbin/spark-config.sh`

#### Spark Setting for pyspark in .bashrc

- Set up PYSPARK_PYTHON
`export PYSPARK_PYTHON=/usr/bin/python3`

- Set up PYSPARK_DRIVER_PYTHON
`export PYSPARK_DRIVER_PYTHON=/usr/bin/python3`

- Execute the following
`source ~/.bashrc`

