#Initial Setup for Hadoop Config Files

###Files to be updated (hadoop_dir/etc/hadoop/)

	-	core-site.xml
	-	hdfs-site.xml
	-	mapred-site.xml
	-	yarn-site.xml

### Commands to Start HDFS/Yarn
	*<ssh localhost> test before and create proper ssh keys as needed

#### Starting services (first time)
	`bin/hdfs namenode format`

	`sbin/start-dfs.sh`

	`sbin/start-yarn.sh`