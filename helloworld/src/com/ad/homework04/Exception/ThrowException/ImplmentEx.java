package com.ad.homework04.Exception.ThrowException;

public class ImplmentEx implements InterfaceEx {

    @Override
    public void danger() throws Exception {
        //todo 在函数内部自己创建异常抛出去
        throw new Exception("抛出异常");
    }

    @Override
    public void save() {
        // todo 报错 因为接口（父类）没有抛出异常 checked exception会出错
      //throw new Exception();
    // todo 可以在方法内部catch住 封装成RUNTIMEEXCEPTION
        try {
            throw new Exception("抛出能被catch的异常");
        } catch (Exception e) {
            System.out.println("被catch住了");
            //throw new RuntimeException();
            //e.printStackTrace();
        }
    }
}
