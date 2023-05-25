package DProxy;



public class ClientClass {
    public static void main(String[] args) {
        IShowPic isp=new CRemoPic();
        CLocalPicShow cpic=new CLocalPicShow(isp);
        IShowPic localpic=(IShowPic) cpic.getProxyInstance();
        localpic.ShowPic("AAA");

    }
}
