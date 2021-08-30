package com.fxc.algorithm.problem.面试题积累.字节跳动笔试编程题;

import java.util.*;

/**
 * 为了不断优化推荐效果，今日头条每天要存储和处理海量数据。假设有这样一种场景：
 * 我们对用户按照它们的注册时间先后来标号，对于一类文章，每个用户都有不同的喜好值，
 * 我们会想知道某一段时间内注册的用户（标号相连的一批用户）中，有多少用户对这类文
 * 章喜好值为k。因为一些特殊的原因，不会出现一个查询的用户区间完全覆盖另一个查询
 * 的用户区间(不存在L1<=L2<=R2<=R1)。
 * <p>
 * 输入描述:
 * 输入： 第1行为n代表用户的个数 第2行为n个整数，第i个代表用户标号为i的用户对某类
 * 文章的喜好度 第3行为一个正整数q代表查询的组数  第4行到第（3+q）行，每行包含3个
 * 整数l,r,k代表一组查询，即标号为l<=i<=r的用户中对这类文章喜好值为k的用户的个数。
 * 数据范围n <= 300000,q<=300000 k是整型
 * <p>
 * 输出描述:
 * 输出：一共q行，每行一个整数代表喜好值为k的用户的个数
 * <p>
 * 输入例子1:
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 * <p>
 * 输出例子1:
 * 1
 * 0
 * 2
 * <p>
 * 例子说明1:
 * 样例解释:
 * 有5个用户，喜好值为分别为1、2、3、3、5，
 * 第一组询问对于标号[1,2]的用户喜好值为1的用户的个数是1
 * 第二组询问对于标号[2,4]的用户喜好值为5的用户的个数是0
 * 第三组询问对于标号[3,5]的用户喜好值为3的用户的个数是2
 */
public class 用户喜好 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  输入 n 个用户
        Integer n = Integer.parseInt(sc.nextLine());
        //  获取 n 个用户的喜好值，用Map来存储：Map<Integer, Set<Integer>> key:喜好值，value：用户id
        Map<Integer, List<Integer>> dic = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int fav = sc.nextInt();
            if (dic.get(fav) == null) {//   如果当前fav值为添加到map中
                //  新建set，存储当前用户id
                List<Integer> user = new LinkedList<>();
                user.add(i + 1);  //  将用户添加到set中
                dic.put(fav, user);
            } else {
                //  fav已存在,直接添加用户id即可
                dic.get(fav).add(i + 1);
            }
        }
        //  获取查询行数
        List<Integer> res = new ArrayList<>();
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int fav = sc.nextInt();
            int cnt = 0;
            List<Integer> tmp = dic.get(fav);
            if (tmp != null) {
                for (Integer num : tmp) {
                    if (num >= l && num <= r) cnt++;
                }
            }
            res.add(cnt);
        }
        for (Integer num : res) {
            System.out.println(num);
        }
    }
}
