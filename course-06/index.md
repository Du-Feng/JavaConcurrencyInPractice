对应于极客户时间的 《Java并发编程实践》的第六课：
[06 | 用“等待-通知”机制优化循环等待](https://time.geekbang.org/column/article/85241)

# pom.xml
修改 Property:

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

添加maven-compiler-plugin

        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>11</source>
                    <target>11</target>
                </configuration>
            </plugin>
        </plugins>