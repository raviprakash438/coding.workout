package com.example.coding.workout.Services;

import com.example.rest.entity.Author;
import com.example.rest.entity.ResponseDetail;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class AuthorService {

    public List<String> getAuthorTitles(String urlpath,int page,List<String> titles){
        ResponseDetail responseDetail= new ResponseDetail();
        try{
            String url = urlpath+"&page="+page;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            con.disconnect();
            //print in String
            System.out.println(response.toString());
            //Read JSON response and print
            //JSONObject myResponse = new JSONObject(response.toString());
            Gson gson = new Gson();
            responseDetail=  gson.fromJson(response.toString(),ResponseDetail.class);

            if(responseDetail.getContent()!=null){
                Author[] authors=responseDetail.getContent();
                for(Author author: authors){
                    if(author.getTitle()!=null){
                        titles.add(author.getTitle());
                    }
                    else if(author.getLink()!=null){
                        titles.add(author.getLink());
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Exception: "+ e);
        }

        return page<responseDetail.getTotal_page()?getAuthorTitles(urlpath,page+1,titles):titles;
    }
}
