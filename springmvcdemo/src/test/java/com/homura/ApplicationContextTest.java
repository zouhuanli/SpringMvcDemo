package com.homura;

import com.homura.bean.Alpha;
import com.homura.bean.MyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Stack;

public class ApplicationContextTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
        applicationContext.start();
        //   Alpha alpha = applicationContext.getBean(Alpha.class);
        MyFactoryBean factoryBeanSelf = applicationContext.getBean(MyFactoryBean.class);
        System.out.println(factoryBeanSelf);
        MyFactoryBean factoryBeanSelfAlso = (MyFactoryBean) applicationContext.getBean("&myFactoryBean");
        System.out.println(factoryBeanSelfAlso);
        Alpha exposeBean = (Alpha) applicationContext.getBean("myFactoryBean");
        System.out.println(exposeBean);
        Alpha alpha = (Alpha) applicationContext.getBean("alpha");
        System.out.println(alpha);
        //  Alpha alpha1 = (Alpha) applicationContext.getBean(Alpha.class);报错
        /**
         * 下面是GitHub  Copilot辅助自动生成的代码
         * */
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9};
        //SORT
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println();
        //quick sort
        int[] array1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9};
        quickSort(array1, 0, array1.length - 1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ",");
        }
        //max
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println();
        System.out.println(max);
        //min
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        System.out.println(min);
        //average
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);
        //median
        int median = array[array.length / 2];
        System.out.println(median);
        //why    median = array[array.length/2];  is wrong
        //because array.length/2 is int, so it will be round down
        //so if array.length is even, the median will be wrong
        //so we need to use double
        double median1 = (array[array.length / 2] + array[array.length / 2 - 1]) / 2.0;
        //simple RSA
        int p = 3;
        int q = 11;
        int n = p * q;
        int e = 3;
        int d = 7;
        int m = 2;
        int c = (int) (Math.pow(m, e) % n);
        System.out.println(c);
        int m1 = (int) (Math.pow(c, d) % n);
        System.out.println(m1);
        //simple RSA
        // describe RSA with a simple way
        // 1. choose two prime number p and q
        // 2. n = p*q
        // 3. choose e, e is coprime with (p-1)*(q-1)
        // 4. choose d, d*e = 1 mod (p-1)*(q-1)
        // 5. public key is (n,e)
        // 6. private key is (n,d)
        // 7. encrypt: c = m^e mod n
        // 8. decrypt: m = c^d mod n
        // 9. m is the message, c is the cipher
        // 10. RSA is a asymmetric encryption algorithm
        // 11. RSA is a public key encryption algorithm
        // 12. RSA is a block cipher
        // 13. RSA is a hybrid encryption algorithm
        // 14. RSA is a signature algorithm
        // 15. RSA is a key exchange algorithm
        // 16. RSA is a digital envelope algorithm
        // 17. RSA is a digital certificate algorithm
        // 18. RSA is a digital signature algorithm
        //fast power(p,n)
        int p1 = 2;
        int n1 = 10;
        int result = 1;
        while (n1 != 0) {
            if (n1 % 2 == 1) {
                result = result * p1;
            }
            p1 = p1 * p1;
            n1 = n1 / 2;
        }

///
        //   给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
        //   示例 1：
        //   输入：nums = [1,1,2]
        //   输出：
        //   [[1,1,2],
        //   [1,2,1],
        //   [2,1,1]]
        //   示例 2：
        //   输入：nums = [1,2,3]
        //   输出：
        //   [[1,2,3],
        //   [1,3,2],
        //   [2,1,3],
        //   [2,3,1],
        //   [3,1,2],
        //   [3,2,1]]
        //   提示：
        //   1 <= nums.length <= 8
        //   -10 <= nums[i] <= 10
        //   通过次数215,377提交次数335,576
        //   来源：力扣（LeetCode）
        //   链接：https://leetcode-cn.com/problems/permutations-ii
        //   class Solution {
        //       public List<List<Integer>> permuteUnique(int[] nums) {
        //           List<List<Integer>> res = new ArrayList<>();
        //           List<Integer> path = new ArrayList<>();
        //           boolean[] used = new boolean[nums.length];
        //           Arrays.sort(nums);
        //           dfs(nums, res, path, used);
        //           return res;
        //       }
        //       private void dfs(int[] nums, List<List<Integer>> res, List<Integer> path, boolean[] used) {
        //           if (path.size() == nums.length) {
        //               res.add(new ArrayList<>(path));
        //               return;
        //           }
        //           for (int i = 0; i < nums.length; i++) {
        //               if (used[i]) {
        //                   continue;
        //               }
        //               if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
        //                   continue;
        //               }
        //               path.add(nums[i]);
        //               used[i] = true;
        //               dfs(nums, res, path, used);
        //               path.remove(path.size() - 1);
        //               used[i] = false;
        //           }
        //       }
        //   }
        //计算1-N的质数个数
        //   class Solution {
        //       public int countPrimes(int n) {
        //           int count = 0;
        //           for (int i = 2; i < n; i++) {
        //               if (isPrime(i)) {
        //                   count++;
        //               }
        //           }
        //           return count;

        //       }
        //       private boolean isPrime(int n) {
        //           for (int i = 2; i * i <= n; i++) {
        //               if (n % i == 0) {
        //                   return false;
        //               }
        //           }
        //           return true;
        //       }
        //如何优化？
        //   class Solution {
        //       public int countPrimes(int n) {
        //           int count = 0;
        //           boolean[] isPrime = new boolean[n];
        //           Arrays.fill(isPrime, true);
        //           for (int i = 2; i < n; i++) {
        //               if (isPrime[i]) {
        //                   count++;
        //                   for (int j = i * i; j < n; j += i) {
        //                       isPrime[j] = false;
        //                   }
        //               }
        //           }
        //           return count;
        //       }
        //   }
        //介绍RSA
        //   1. RSA是一种非对称加密算法
        //   2. RSA是一种公钥加密算法
        //   3. RSA是一种分组加密算法
        //   4. RSA是一种混合加密算法
        //   5. RSA是一种签名算法
        //   6. RSA是一种密钥交换算法
        //   7. RSA是一种数字信封算法
        //   8. RSA是一种数字证书算法
        //   9. RSA是一种数字签名算法
        //   10. RSA是一种数字签名算法
        //   11. RSA是一种数字签名算法
        //write a simple websit
        //   1. use spring boot
        //   2. use spring security
        //   3. use spring data jpa
        //   4. use mysql
        //   5. use thymeleaf
        //   6. use bootstrap
        //   7. use jquery
        //   8. use ajax
        //   9. use websocket
        //   10. use redis
        //   11. use rabbitmq
        //   12. use elasticsearch
        //   13. use docker
        //   14. use kubernetes
        //   15. use jenkins
        //   16. use gitlab
        //   17. use nginx
        //   18. use tomcat
        //   19. use apache
        //   20. use linux
        //   21. use shell
        //   22. use python
        //   23. use java
        //24


//按照国际象棋的规则，皇后可以攻击与之处在同一行或同一列或同一斜线上的棋子。
//
//n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
//
//给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
//
//每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
//
//
//示例 1：
//
//
//输入：n = 4
//输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//解释：如上图所示，4 皇后问题存在两个不同的解法。
//示例 2：
//
//输入：n = 1
//输出：[["Q"]]
//
//
//提示：
//
//1 <= n <= 9
//通过次数159,377提交次数204,718
//请问您在哪类招聘中看到此题？
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/n-queens
//class Solution {
//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> res = new ArrayList<>();
//        char[][] board = new char[n][n];
//        for (int i = 0; i < n; i++) {
//            Arrays.fill(board[i], '.');
//        }
//        dfs(board, 0, res);
//        return res;
//    }
//    private void dfs(char[][] board, int row, List<List<String>> res) {
//        if (row == board.length) {
//            res.add(construct(board));
//            return;
//        }
//        for (int col = 0; col < board.length; col++) {
//            if (!isValid(board, row, col)) {
//                continue;
//            }
//            board[row][col] = 'Q';
//            dfs(board, row + 1, res);
//            board[row][col] = '.';
//        }
//    }
//    private boolean isValid(char[][] board, int row, int col) {
//        for (int i = 0; i < row; i++) {
//            if (board[i][col] == 'Q') {
//                return false;
//            }
//        }
//        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//        return true;
//    }
//    private List<String> construct(char[][] board) {
//        List<String> res = new ArrayList<>();
//        for (int i = 0; i < board.length; i++) {
//            res.add(new String(board[i]));
//        }
//        return res;
//    }
//}
//how to user ClasspathXmlApplicationContext
//   ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc-context.xml");
//   applicationContext.start();
//   Alpha alpha = applicationContext.getBean(Alpha.class);
//   System.out.println(alpha);
//   applicationContext.stop();
//   applicationContext.close();
//   applicationContext.refresh();
//   applicationContext.registerShutdownHook();
//   applicationContext.registerBeanDefinition();
//   applicationContext.getBeanDefinitionCount();
//   applicationContext.getBeanDefinitionNames();
//   applicationContext.getBeanNamesForType();
//   applicationContext.getBean();
//   applicationContext.getBeanProvider();
//   applicationContext.getBeanFactory();
//   applicationContext.getAutowireCapableBeanFactory()
        //will you give me a JetBrains All Products Pack license?
        //   1. IntelliJ IDEA
        //   2. PyCharm
        //   3. WebStorm
        //   4. PhpStorm
        //   5. DataGrip
        //   6. RubyMine
        //   7. GoLand
        //   8. AppCode
        //   9. CLion
        //   10. Rider
        //   11. MPS
        //   12. Android Studio
        //   13. Datalore
        //   14. Space
        //   15. YouTrack
        //   16. TeamCity
        //   17. Upsource
        //   18. Hub
        //   19. Kotlin
        //   20. KotlinConf
        //   21. Kotlin/Native
        //   22. Kotlin/JS
        //   23. Kotlin Multiplatform
        //   24. Kotlin for Data Science
        //   25. Kotlin for Server Side
        //   26. Kotlin for Android
        //describe AQS
        //   1. AQS是一个抽象类
        //   2. AQS是一个同步器
        //   3. AQS是一个队列同步器
        //   4. AQS是一个框架
        //   5. AQS是一个模板方法模式
        //   6. AQS是一个模板方法模式
        //   7. AQS是一个模板方法模式
        //   8. AQS是一个模板方法模式
        //   9. AQS是一个模板方法模式
        //describe reentrantLock
        //   1. ReentrantLock是一个可重入锁
        //   2. ReentrantLock是一个独占锁
        //   3. ReentrantLock是一个公平锁
        //   4. ReentrantLock是一个非公平锁
        //   5. ReentrantLock是一个可重入锁
        //how to use it
        //   ReentrantLock lock = new ReentrantLock();
        //   lock.lock();
        //   try {
        //       //do something
        //   } finally {
        //       lock.unlock();
        //   }
        //   ReentrantLock lock = new ReentrantLock(true);
        //   lock.lock();
        //   try {
        //       //do something
        //   } finally {
        //       lock.unlock();
        //   }
        //   ReentrantLock lock = new ReentrantLock(false);
        //   lock.lock();
        //   try {
        //       //do something
        //   } finally {
        //       lock.unlock();
        //   }
        //   ReentrantLock lock = new ReentrantLock();
        //   lock.lock();
        //   try {
        //       //do something
        //   } finally {
        //       lock.unlock();
        //   }
        //   ReentrantLock lock = new ReentrantLock();
        //write a markdown document about how to use it
        //   1. ReentrantLock是一个可重入锁
        //   2. ReentrantLock是一个独占锁
        //   3. ReentrantLock是一个公平锁
        //   4. ReentrantLock是一个非公平锁
        //   5. ReentrantLock是一个可重入锁
        //Object to Json String
        //   1. use jackson
        //   2. use gson
        //   3. use fastjson
        //   4. use json-lib
        //   5. use json-io
        //   6. use flexjson
        //   7. use json-simple
        //   8. use boon
        //   9. use json-smart
        //   10. use dsl-json
        //   11. use moshi
        //use jackson
        //   ObjectMapper objectMapper = new ObjectMapper();
        //   objectMapper.writeValueAsString(object);
        //   objectMapper.readValue(jsonString, Object.class);
        //   objectMapper.readValue(jsonString, new TypeReference<List<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<Map<String, Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<Set<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<Collection<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<Queue<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<Deque<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<LinkedList<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<SortedSet<Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<SortedMap<String, Object>>() {});
        //   objectMapper.readValue(jsonString, new TypeReference<ConcurrentMap<String, Object>>() {});
        //describe LocalDate
        //   1. LocalDate是一个不可变对象
        //   2. LocalDate是一个线程安全对象
        //   3. LocalDate是一个日期对象
        //   4. LocalDate是一个日期对象
        //   5. LocalDate是一个日期对象
        //   6. LocalDate是一个日期对象
        //   7. LocalDate是一个日期对象
        //samples?
        //   LocalDate localDate = LocalDate.now();
        //   LocalDate localDate = LocalDate.of(2021, 1, 1);
        //   LocalDate localDate = LocalDate.parse("2021-01-01");
        //   LocalDate localDate = LocalDate.parse("2021-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        //   LocalDate localDate = LocalDate.parse("2021-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA));
        //   LocalDate localDate = LocalDate.parse("2021-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA).withZone(ZoneId.systemDefault()));
        //   LocalDate localDate = LocalDate.parse("2021-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA).withZone(ZoneId.systemDefault()).withChronology(IsoChronology.INSTANCE));
        //   LocalDate localDate = LocalDate.parse("2021-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA).withZone(ZoneId.systemDefault()).withChronology(IsoChronology.INSTANCE).withResolverStyle(ResolverStyle.STRICT));
        //   LocalDate localDate = LocalDate.parse("2021-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA).withZone(ZoneId.systemDefault()).withChronology(IsoChronology.INSTANCE).withResolverStyle(ResolverStyle.STRICT).withResolverFields(ChronoField.YEAR));

        //Date to LocalDate
        //   Date date = new Date();
        //   LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //LocalDate to Date
        //   LocalDate localDate = LocalDate.now();
        //   Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        //LocalDate to LocalDateTime
        //   LocalDate localDate = LocalDate.now();
        //   LocalDateTime localDateTime = localDate.atStartOfDay();
        //LocalDateTime to LocalDate
        //   LocalDateTime localDateTime = LocalDateTime.now();
        //   LocalDate localDate = localDateTime.toLocalDate();
        //LocalDate to LocalTime
        //   LocalDate localDate = LocalDate.now();
        //   LocalTime localTime = localDate.atTime(0, 0, 0);
        //days between two LocalDate
        //   LocalDate localDate1 = LocalDate.now();
        //   LocalDate localDate2 = LocalDate.now();
        //   long days = ChronoUnit.DAYS.between(localDate1, localDate2);
        //   long days = ChronoUnit.DAYS.between(localDate1.atStartOfDay(), localDate2.atStartOfDay());
        //   long days = ChronoUnit.DAYS.between(localDate1.atStartOfDay(ZoneId.systemDefault()), localDate2.atStartOfDay(ZoneId.systemDefault()));
        //   long days = ChronoUnit.DAYS.between(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant(), localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant());
        //   long days = ChronoUnit.DAYS.between(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant(), localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant());
        //   long days = ChronoUnit.DAYS.between(localDate1.atStartOfDay(ZoneId.systemDefault()).toInstant(), localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant());
        //get now timstamp
        //   long timestamp = System.currentTimeMillis();
        //   long timestamp = Instant.now().toEpochMilli();
        //   long timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        //   long timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        //   long timestamp = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        //get now Date
        //   Date date = new Date();
        //   Date date = Date.from(Instant.now());
        //   Date date = Date.from(Instant.now());
        //   Date date = Date.from(Instant.now());
        //compare  two bigdecimal
        //   BigDecimal bigDecimal1 = new BigDecimal("1.0");
        //   BigDecimal bigDecimal2 = new BigDecimal("1.00");
        //   bigDecimal1.compareTo(bigDecimal2);
        //   bigDecimal1.compareTo(bigDecimal2);
        //why not use equals

        //   1. equals比较的是值和精度
        //   2. compareTo比较的是值
        //   3. compareTo比较的是值

        //why Integer.MAX+1 is negative？
        //   1. Integer.MAX_VALUE是2^31-1
        //   2. Integer.MAX_VALUE+1是2^31
        //   3. 2^31是负数
        //   4. 2^31是负数
        //how much peoples in American
        //   1. 328,239,523
        //how much peoples in China
        //   1. 1,439,323,776
        //how much peoples in Japan

        //how much peoples in Beijin
//write a  spring MVC demo
        //   1. use spring boot
        //   2. use spring mvc
        //   3. use spring security
        //   4. use spring data jpa
        //   5. use mysql
        //   6. use thymeleaf
        //   7. use bootstrap
        //   8. use jquery
        //   9. use ajax
        //   10. use websocket
        //   11. use redis
        //   12. use rabbitmq
        //   13. use elasticsearch
        //   14. use docker
        //   15. use kubernetes
        //   16. use jenkins
        //   17. use gitlab
        //   18. use nginx
        //   19. use tomcat
        //   20. use apache
        //   21. use linux
        //   22. use shell
        //   23. use python
        //   24. use java
        //   25. use kotlin
        //   26. use go
        //   27. use rust
        //   28. use c
        //   29. use c++
        //   30. use c#
        //   31. use php
        //   32. use javascript
        //   33. use typescript
        //   34. use html
        //   35. use css
        //   36. use xml
        //   37. use json
        //   38. use yaml
        //   39. use sql
        //   40. use nosql
        //   41. use graphql
        //   42. use rest
        //   43. use soap
        //   44. use rpc
        //   45. use thrift
        //   46. use grpc
        //   47. use protobuf
        //   48. use http
        //   49. use tcp
        //   50. use udp
        //   51. use ip
        //   52. use dns
        //   53. use ssl
        //write  JDBC sample code？
        //   1. use mysql
        //   2. use oracle
        //   3. use sqlserver
        //   4. use postgresql
        //   5. use db2
        //   6. use sqlite
        //   7. use h2
        //   8. use hsqldb
        //   9. use derby
        //   10. use mariadb
        //   11. use mongodb
        //   12. use redis
        //   13. use memcached
        //   14. use cassandra
        //   15. use elasticsearch
        //   16. use neo4j
        //   17. use hbase
        //   18. use zookeeper
        //   19. use kafka
        //   20. use rabbitmq
        //   21. use activemq
        //   22. use rocketmq
        //   23. use dubbo
        //   24. use spring cloud
        //   25. use spring boot
        //   26. use spring mvc
        //   27. use spring data jpa
        //   28. use mybatis
        //   29. use mybatis plus
        //   30. use jpa
        //   31. use hibernate
        //   32. use jooq
        //   33. use jdbctemplate
        //   34. use jdbc
        //   35. use jta
        //   36. use atomikos
        //   37. use bitronix
        //   38. use narayana
        //   39. use shardingjdbc
        //   40. use druid
        //   41. use hikari
        //   42. use c3p0
        //   43. use tomcat jdbc pool
        //   44. use dbcp
        //   45. use dbcp2
        //   46. use mybatis generator
        //   47. use mybatis plus generator
        //   48. use jpa generator
        //整数转罗马数字
        //   class Solution {
        //       public String intToRoman(int num) {
        //           int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9 ,5, 4, 1};
        //           String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX" ,"V", "IV", "I"};
        //           StringBuilder stringBuilder = new StringBuilder();
        //           for (int i = 0; i < values.length; i++) {
        //               while (num >= values[i]) {
        //                   num -= values[i];
        //                   stringBuilder.append(symbols[i]);
        //               }
        //           }
        //           return stringBuilder.toString();
        //       }
        //   }
        //罗马数字转整数
        //   class Solution {
        //       public int romanToInt(String s) {
        //           Map<String, Integer> map = new HashMap<>();
        //           map.put("I", 1);
        //           map.put("IV", 4);
        //           map.put("V", 5);
        //           map.put("IX", 9);
        //           map.put("X", 10);
        //           map.put("XL", 40);
        //           map.put("L", 50);
        //           map.put("XC", 90);
        //           map.put("C", 100);
        //           map.put("CD", 400);
        //           map.put("D", 500);
        //           map.put("CM", 900);
        //           map.put("M", 1000);
        //           int res = 0;
        //           for (int i = 0; i < s.length(); i++) {
        //               if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
        //                   res += map.get(s.substring(i, i + 2));
        //                   i++;
        //               } else {
        //                   res += map.get(s.substring(i, i + 1));
        //               }
        //           }
        //           return res;
        //       }
        //   }
//数字转汉语大写
//金额数字转汉语大写
//   class Solution {
//       public String numberToWords(int num) {
//           if (num == 0) {
//               return "Zero";
//           }
//           String[] units = {"", "Thousand", "Million", "Billion"};
//           String[] digits = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//           String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
//           String[] twenties = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty","Ninety"};
//           StringBuilder stringBuilder = new StringBuilder();
//           int index = 0;
//           while (num > 0) {
//               if (num % 1000 != 0) {
//                   StringBuilder temp = new StringBuilder();
//                   int n = num % 1000;
//                   if (n >= 100) {
//                       temp.append(digits[n / 100]).append(" Hundred ");
//                       n %= 100;
//                   }
//                   if (n >= 20) {
//                       temp.append(twenties[n / 10]).append(" ");
//                       n %= 10;
//                   }
//                   if (n >= 10) {
//                       temp.append(teens[n - 10]).append(" ");
//                       n = 0;
//                   }
//                   if (n > 0) {
//                       temp.append(digits[n]).append(" ");
//                   }
//                   temp.append(units[index]).append(" ");
//                   stringBuilder.insert(0, temp);
//               }
//               index++;
//               num /= 1000;
//           }
//           return stringBuilder.toString().trim();
//       }
//   }
//判断链表成环
//   class Solution {
//       public boolean hasCycle(ListNode head) {
//           if (head == null || head.next == null) {
//               return false;
//           }
//           ListNode slow = head;
//           ListNode fast = head.next;
//           while (slow != fast) {
//               if (fast == null || fast.next == null) {
//                   return false;
//               }
//               slow = slow.next;
//               fast = fast.next.next;
//           }
//           return true;
//       }
//   }
//判断链表成环的入口
//   class Solution {
//       public ListNode detectCycle(ListNode head) {
//           if (head == null || head.next == null) {
//               return null;
//           }
//           ListNode slow = head;
//           ListNode fast = head;
//           while (fast != null && fast.next != null) {
//               slow = slow.next;
//               fast = fast.next.next;
//               if (slow == fast) {
//                   ListNode index1 = head;
//                   ListNode index2 = slow;
//                   while (index1 != index2) {
//                       index1 = index1.next;
//                       index2 = index2.next;
//                   }
//                   return index1;
//               }
//           }
//           return null;
//       }
//   }
//判断链表成环的长度
//   class Solution {
//       public int detectCycleLength(ListNode head) {
//           if (head == null || head.next == null) {
//               return 0;
//           }
//           ListNode slow = head;
//           ListNode fast = head;
//           while (fast != null && fast.next != null) {
//               slow = slow.next;
//               fast = fast.next.next;
//               if (slow == fast) {
//                   ListNode index1 = head;
//                   ListNode index2 = slow;
//                   int count = 0;
//                   while (index1 != index2) {
//                       index1 = index1.next;
//                       index2 = index2.next;
//                       count++;
//                   }
//                   return count;
//               }
//           }
//           return 0;
//       }
//   }
        //查询一下中国个人所得税率表
        //   1. 0-36000 3%
        //   2. 36000-144000 10%
        //   3. 144000-300000 20%
        //   4. 300000-420000 25%
        //   5. 420000-660000 30%
        //   6. 660000-960000 35%
        //   7. 960000 45%
        //   8. 960000 45%
        //   9. 960000 45%
        //   10. 960000 45%
        //给你一个年收入N，计算所得税
        //   class Solution {
        //       public double calculateTax(double income) {
        //           if (income <= 36000) {
        //               return income * 0.03;
        //           }
        //           if (income <= 144000) {
        //               return 36000 * 0.03 + (income - 36000) * 0.1;
        //           }
        //           if (income <= 300000) {
        //               return 36000 * 0.03 + (144000 - 36000) * 0.1 + (income - 144000) * 0.2;
        //           }
        //           if (income <= 420000) {
        //               return 36000 * 0.03 + (144000 - 36000) * 0.1 + (300000 - 144000) * 0.2 + (income - 300000) * 0.25;
        //           }
//           if (income <= 660000) {
//               return 36000 * 0.03 + (144000 - 36000) * 0.1 + (300000 - 144000) * 0.2 + (420000 - 300000) * 0.25 + (income - 420000) * 0.3;
//           }
//           if (income <= 960000) {
//               return 36000 * 0.03 + (144000 - 36000) * 0.1 + (300000 - 144000) * 0.2 + (420000 - 300000) * 0.25 + (660000 - 420000) * 0.3 + (income - 660000) * 0.35;
//           }
//           return 36000 * 0.03 + (144000 - 36000) * 0.1 + (300000 - 144000) * 0.2 + (420000 - 300000) * 0.25 + (660000 - 420000) * 0.3 + (960000 - 660000) * 0.35 + (income - 960000) * 0.45;
//       }
//   }
//   class Solution {
//       public double calculateTax(double income) {
//           double[] rates = {0.03, 0.1, 0.2, 0.25, 0.3, 0.35, 0.45};
//           double[] thresholds = {36000, 144000, 300000, 420000, 660000, 960000};
//           double tax = 0;
//           for (int i = 0; i < rates.length; i++) {
//               if (income <= thresholds[i]) {
//                   return tax + income * rates[i];
//               }
//               tax += thresholds[i] * rates[i];
//               income -= thresholds[i];
//           }
//           return tax + income * rates[rates.length - 1];
//       }
//   }
//compare  two bigdecimal
        //   BigDecimal bigDecimal1 = new BigDecimal("1.0");
        //   BigDecimal bigDecimal2 = new BigDecimal("1.00");
        //   bigDecimal1.compareTo(bigDecimal2);
        //   bigDecimal1.compareTo(bigDecimal2);
        //why not use equals

        //   1. equals比较的是值和精度
        //   2. compareTo比较的是值
        //   3. compareTo比较的是值
        //how much peoples in Xiamen
//   1. 4,121,532
        //write a Stream sample code with Java8
        //   List<Integer> list = new ArrayList<>();
        //   list.add(1);
        //   list.add(2);
        //   list.add(3);
        //   list.add(4);
        //   list.add(5);
        //   list.add(6);
        //   list.add(7);
        //   list.add(8);
        //   list.add(9);
        //   list.add(10);
        //   list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        //   list.stream().map(i -> i * i).forEach(System.out::println);
        //   list.stream().sorted().forEach(System.out::println);
        //   list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //   list.stream().sorted(Comparator.comparingInt(i -> i)).forEach(System.out::println);
        //归并排序
        //   public static void mergeSort(int[] array, int low, int high) {
        //       if (low < high) {
        //           int middle = (low + high) / 2;
        //           mergeSort(array, low, middle);
        //           mergeSort(array, middle + 1, high);
        //           merge(array, low, middle, high);
        //       }
        //   }
        //   public static void merge(int[] array, int low, int middle, int high) {
        //       int[] temp = new int[high - low + 1];
        //       int i = low;
        //       int j = middle + 1;
        //       int k = 0;
        //       while (i <= middle && j <= high) {
        //           if (array[i] < array[j]) {
        //               temp[k++] = array[i++];
        //           } else {
        //               temp[k++] = array[j++];
        //           }
        //       }
        //       while (i <= middle) {
        //           temp[k++] = array[i++];
        //       }
        //       while (j <= high) {
        //           temp[k++] = array[j++];
        //       }
        //       for (int l = 0; l < temp.length; l++) {
        //           array[low + l] = temp[l];
        //       }
        //   }
        //快速排序
        //   public static void quickSort(int[] array, int low, int high) {
        //       if (low < high) {
        //           int middle = getMiddle(array, low, high);

        //write a  simple website using spring boot
        //   1. use spring boot
        //   2. use spring mvc
        //   3. use spring security
        //   4. use spring data jpa

        //写一个简单的SpringBoot网站
        //   1. 使用SpringBoot
        //   2. 使用SpringMVC
        //   3. 使用SpringSecurity
        //   4. 使用SpringDataJPA
        //   5. 使用MySQL
        //   6. 使用Thymeleaf
        //   7. 使用Bootstrap
        //   8. 使用jQuery
        //   9. 使用Ajax
        //   10. 使用Websocket

        //写一个简单的H5页面
        //   1. 使用HTML
        //   2. 使用CSS
        //   3. 使用JavaScript
        //   4. 使用jQuery

        //实现一个计算器功能，输入一个数学表达式，计算结果，支持加减乘除和括号，你可以假设输入表达式总是合法的。
        class Solution {
            public int calculate(String s) {
                Stack<Integer> stack = new Stack<>();
                int num = 0;
                char sign = '+';
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (Character.isDigit(c)) {
                        num = num * 10 + c - '0';
                    }
                    if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                        if (sign == '+') {
                            stack.push(num);
                        }
                        if (sign == '-') {
                            stack.push(-num);
                        }
                        if (sign == '*') {
                            stack.push(stack.pop() * num);
                        }
                        if (sign == '/') {
                            stack.push(stack.pop() / num);
                        }
                        sign = c;
                        num = 0;
                    }
                }
                int res = 0;
                while (!stack.isEmpty()) {
                    res += stack.pop();
                }
                return res;
            }
        }
        Solution solution = new Solution();
        System.out.println("calculate");
        System.out.println(solution.calculate("1+1"));
        System.out.println(solution.calculate(" 2-1 + 2 "));
        System.out.println(solution.calculate("(1+(4*50+29)-3)+(67+8)+6-7"));
        System.out.println(solution.calculate("1+1"));
        System.out.println(solution.calculate("1+1"));
        //介绍一下GitHub Copilot
//   1. GitHub Copilot是一个AI代码助手
//   2. GitHub Copilot是一个AI代码助手
//   3. GitHub Copilot是一个AI代码助手
//   4. GitHub Copilot是一个AI代码助手

        //详细一点？
//   1. GitHub Copilot是一个AI代码助手
//   2. GitHub Copilot是一个AI代码助手
//   3. GitHub Copilot是一个AI代码助手
//   4. GitHub Copilot是一个AI代码助手


    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = getMiddle(array, low, high);
            quickSort(array, low, middle - 1);
            quickSort(array, middle + 1, high);
        }
    }

    public static int getMiddle(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        return low;
    }
}
