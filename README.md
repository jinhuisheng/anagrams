# anagrams

## 问题描述
Write a program to generate all potential
anagrams of an input string.

For example, the potential anagrams of "biro" are
>
>biro bior brio broi boir bori
ibro ibor irbo irob iobr iorb
rbio rboi ribo riob roib robi
obir obri oibr oirb orbi orib

从描述和举例来看，该问题是字符串的全排列。

biro -> bior 是第二位和第三位的对调。
每一个变化都是字符串中的两个字符对调位置。

## 需求分析
对输入字符串的字符顺序进行不同的排列，得出所有可能的组合；
比如： 

"a" 就只有"a"
"ab" -> "ab","ba"
"abc" -> "abc","acb","bac","bca","cab","cba"

"biro" -> "biro", "bior", "brio", "broi", "boir", "bori",
          "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
          "rbio", "rboi", "ribo", "riob", "roib", "robi",
          "obir", "obri", "oibr", "oirb", "orbi", "orib"


## kata 地址
https://www.codeproject.com/Articles/498404/TDD-the-Anagrams-Kata

## kata 视频
https://www.bilibili.com/video/BV1oW411U7bu?p=2
