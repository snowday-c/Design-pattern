package DProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLocalPicShow {
    private Object target;
    public CLocalPicShow(Object target){
        super();
        this.target=target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
                        System.out.println("准备载入图片"+arg2[0].toString());
                        Thread thr=new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try {
                                    arg1.invoke(target,arg2);
                                } catch (IllegalAccessException e) {
                                    throw new RuntimeException(e);
                                } catch (InvocationTargetException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                        thr.start();
                        return null;
                    }
                });
    }
}
