import com.example.newsbroker.NewsAgency;
import com.example.newsbroker.NewsChannel;


public class App{

    public static void main(String[] args) throws Exception{

        var apa = news NewsAgency(name:"APA");
        var reuters = news NewsAgency(name:"reuters");


        var orf = news NewsChannel("orf.at");
        var nzz = new NewsChannel("nzz.ch");
        var nytimes = new NewsChannel("nytimes.com");

        apa.subscribe(orf);
        apa.subscribe(nzz);

        reuters.subscribe(nytimes);
        reuters.subscribe(nzz);


        app.broadcast(news:"Auf der suche nach der nächsten regierung");
        reuters.broadcast(news:"Harris campaign raises $55 mln over two weekend events, campign officials says");
        

    }



}