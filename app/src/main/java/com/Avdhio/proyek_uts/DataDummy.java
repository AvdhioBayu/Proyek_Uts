package com.Avdhio.proyek_uts;

import com.Avdhio.proyek_uts.Model.GameLogo;

import java.util.ArrayList;

public class DataDummy {
    public static String gameName []= {
            "PUBG"
    };

    public  static String Detail []={
    "PlayerUnknown's Battlegrounds (sering disingkat PUBG) adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim.",
    };

    public static int logogame []={
            R.drawable.pubg

    };

    static ArrayList <GameLogo> GetListData(){
    ArrayList<GameLogo> list = new ArrayList<>();
    for (int position = 0; position < gameName.length;position++){
        GameLogo gameLogo = new GameLogo();
        gameLogo.setName(gameName[position]);
        gameLogo.setDetail(Detail[position]);
        gameLogo.setLogogame(logogame[position]);
        list.add(gameLogo);
    }
    return list;
    };
}
