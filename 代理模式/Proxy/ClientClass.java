package Proxy;
import Proxy.IShowPic;
import Proxy.CLocalPicShow;
import Proxy.CRemoPic;
public class ClientClass {
    public static void main(String[] args) {
        CLocalPicShow cls=new CLocalPicShow();
        cls.ShowPic("photo");
        IShowPic ipic=new CRemoPic();
        IShowPic proxy=(IShowPic) new CRemoPic();
        proxy.ShowPic("AAA");
    }
}
