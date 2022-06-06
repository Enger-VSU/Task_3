package com.company;

//1. Дана очередь целых чисел. Обработать очередь таким образом, чтобы в очереди остались только четные элементы.

public class Task {
    public static SimpleQueue<Integer> Process(SimpleQueue<Integer> list) throws Exception{
        int k;
        int h = 0;
        int[] arr = new int[list.count()];
        int count = list.count();
        for (int i = 0; i < count; i++){
            k = list.remove();
            if (k % 2 == 0){
                arr[h] = k;
                h++;
            }
        }
        for (int i = 0; i < h; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
