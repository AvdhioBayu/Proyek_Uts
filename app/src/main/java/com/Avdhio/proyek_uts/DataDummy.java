package com.Avdhio.proyek_uts;

import com.Avdhio.proyek_uts.Model.GameLogo;

import java.util.ArrayList;

public class DataDummy {
    public static String gameName []= {
            "PlayerUnkown's Battlegrounds"
    };

    public  static String Detail []={
    "PlayerUnknown's Battlegrounds (sering disingkat PUBG) adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim.",
    };

    public static String Spec[] = {
            "Spesifikasi Minimum PUBG Untuk PC\n" +
                    "Sistem Operasi: 64-bit Windows 7, Windows 8.1, Windows 10.\n" +
                    "Processor: Intel Core i3-4340 / AMD FX-6300.\n" +
                    "Memory RAM: 8 GB RAM.\n" +
                    "VGA Card: Nvidia GeForce GTX 660 2GB / AMD Radeon HD 7850 2GB.\n" +
                    "DirectX: Versi 11.\n" +
                    "Koneksi: Broadband Internet connection.\n" +
                    "Penyimpann HDD: 30 GB tersedia pada HDD.\n",
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
