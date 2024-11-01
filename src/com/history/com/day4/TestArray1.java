package com.history.com.day4;

/*需求：有这样的一个数组，元素是{68,27,95,88,171,966,51,210}。
求出该数组中满足要求的元素和，要求是：求和的元素个位和十位不能是7，
并且只能是偶数*/

/*思路：1、定义一个数组，用静态初始化完成数组元素的初始化
2、定义一个求和变量，初始值是0
3、遍历数组，获取到数组中每一个元素
4、判断该元素是否满足条件，如果满足条件就累加
    arr[x]%10 !=7   arr[x]/10%10 != 7   arr[x]%2 == 0
5、输出求和变量
*/

import java.util.ArrayList;

public class TestArray1 {
    public static void main(String[] args) {
        /*int[] arr={68,27,95,88,171,966,51,210};
        int sum =0;

        for (int x=0;x<arr.length;x++){
            if (arr[x]%10!=7 && arr[x]/10%10!=78 && arr[x]%2==0){
                sum+=arr[x];
            }
        }
        System.out.println("满足条件的元素和为："+sum);*/

        int[] arr={141241,141,444,112412,12412,5435,6546,65756,352,22,22,7,70,17};
        TestArray1 sumt=new TestArray1();
        System.out.println(sumt.sum(arr));
    }

    public ArrayList<Integer> sum(int[] arr) {
        ArrayList<Integer> arrsum=new ArrayList<>();
        for (int i = 0; i <= arr.length-1; i++) {
            int uinit = arr[i] % 10;
            int ten = arr[i] % 100 / 10;
            int sum = uinit + ten;
            if (sum % 10 != 7 && sum / 10 != 7 && sum % 2 != 1) {
                arrsum.add(arr[i]);

            }
        }
        return arrsum;
    }
}
