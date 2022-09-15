package url;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

class user{
    private final int gamesplayed;
    public user (int gamesplayed){
        this.gamesplayed = gamesplayed;
    }
}

public class url {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try{
            URL tetrStats = new URL("https://ch.tetr.io/api/users/brianren");
            URLConnection urlConnection = tetrStats.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(urlConnection.getInputStream()));
            String urlString = "";
            String current;
            while((current = br.readLine()) != null){
                urlString += current;
            }
            gson.fromJson(urlString,user.class);
            System.out.println();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
