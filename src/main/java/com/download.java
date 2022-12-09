package com;

import com.neo.util.OSSClientUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hongxiaobin
 * @Time 2022/12/9-17:35
 */
public class download {
    public static void main(String[] args) {
//        OSSClientUtil.downloadFile("1.png");
//        OSSClientUtil.download("1.png","E:/12.png");
//        OSSClientUtil.deleteOne("1.png");
        List<String> keys = new ArrayList<>();
        keys.add("2454d7e4-3dc4-4c6d-8cd5-7b223d44af5e_dispute.jpg");
        keys.add("26735813-6777-4a18-be41-2515c84f6d46_dispute.jpg");
        keys.add("picture/4a3788d6-a0ea-4962-9252-7f279a15c900_dispute.jpg");
        OSSClientUtil.delete(keys);
    }
}
