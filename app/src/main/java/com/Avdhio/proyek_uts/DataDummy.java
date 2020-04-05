package com.Avdhio.proyek_uts;

import com.Avdhio.proyek_uts.Model.GameLogo;

import java.util.ArrayList;

public class DataDummy {
    public static String gameName []= {
            "PlayerUnkown's Battlegrounds",
            "Tom Clancy's Rainbow Six Siege",
            "Dota 2",
            "Call Of Duty : Warzone",
            "Apex Legends",
            "Watch_Dogs™"
    };

    public  static String Detail []={
            "PlayerUnknown's Battlegrounds (sering disingkat PUBG) adalah sebuah permainan dengan genre battle royale, yang para pemainnya bisa bermain dengan 100 orang sekaligus secara daring. Di dalam permainan ini pemain bisa bermain solo, tim 2 orang, dan tim 4 orang, serta bisa mengundang teman untuk bergabung ke dalam permainan sebagai tim.",
            "Tom Clancy's Rainbow Six Siege is a first-person shooter game, in which players utilize many different operators from the Rainbow team. Different operators have different nationalities, weapons, and gadgets.The game features an asymmetrical structure whereby the teams are not always balanced in their choices of abilities",
            "Dota 2 is a multiplayer online battle arena (MOBA) video game in which two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
            "Warzone features three game modes: Battle Royale, BR Solos and Blood Money.[4] While Battle Royale is a genre popularized by games like PlayerUnknown's Battlegrounds, the \"Blood Money\" gameplay mode is related to the in-game currency mechanic and is unique to Warzone.",
            "Apex Legends is an online multiplayer battle royale game featuring squads of three players using pre-made characters (called \"Legends\"), similar to those of hero shooters. Alternate modes have been introduced allowing for single and for two-player squads since the game's release.",
            "Watch_Dogs takes place in a fully simulated living city where, using your smartphone, you have real-time control over the city’s infrastructure. Trap your enemy in a 30-car pileup by manipulating the traffic lights. Stop a train, and then board it to evade the authorities"
    };

    public static String Spec[] = {
            "Spesifikasi Minimum PUBG PC :\n" +
                    "\n" +
                    "Sistem Operasi: 64-bit Windows 7, Windows 8.1, Windows 10.\n" +
                    "Processor: Intel Core i3-4340 / AMD FX-6300.\n" +
                    "Memory RAM: 8 GB RAM.\n" +
                    "VGA Card: Nvidia GeForce GTX 660 2GB / AMD Radeon HD 7850 2GB.\n" +
                    "DirectX: Versi 11.\n" +
                    "Koneksi: Broadband Internet connection.\n" +
                    "Penyimpann HDD: 30 GB tersedia pada HDD.\n",

            "Here are the Tom Clancy's Rainbow Six: Siege System Requirements (Minimum) :\n" +
                    "\n" +
                    "CPU: Intel Core i3 560 @ 3.3GHz or better, AMD Phenom II X4 945 @ 3.0Ghz or better\n" +
                    "CPU SPEED: Info\n" +
                    "RAM: 6 GB\n" +
                    "OS: Windows 7 64 bit, Windows 8 64 bit, Windows 10 64 bit\n" +
                    "VIDEO CARD: NVIDIA GeForce GTX 460, AMD Radeon HD 5770, And DX11 cards with 1GB VRAM\n" +
                    "SOUND CARD: Yes\n" +
                    "FREE DISK SPACE: 30 GB\n" +
                    "DEDICATED VIDEO RAM: 1 GB",

            "SPESIFIKASI MINIMUM:\n" +
                    "\n" +
                    "OS: Windows 7 or newer\n" +
                    "Processor: Dual core from Intel or AMD at 2.8 GHz\n" +
                    "Memory: 4 GB RAM\n" +
                    "Graphics: nVidia GeForce 8600/9600GT, ATI/AMD Radeon HD2600/3600\n" +
                    "DirectX: Version 9.0c\n" +
                    "Network: Broadband Internet connection\n" +
                    "Storage: 15 GB available space\n" +
                    "Sound Card: DirectX Compatible",

            "Minimum Specifications :\n" +
                    "\n" +
                    "OS: Windows 7 64-Bit (SP1) or Windows 10 64-Bit\n" +
                    "CPU: Intel Core i3-4340 or AMD FX-6300\n" +
                    "RAM: 8GB RAM\n" +
                    "HDD: 175GB HD space\n" +
                    "Video: NVIDIA GeForce GTX 670 / GeForce GTX 1650 or Radeon HD 7950\n" +
                    "DirectX: Requires DirectX 12 compatible system\n" +
                    "Network: Broadband Internet connection\n" +
                    "Sound Card: DirectX Compatible",

            "APEX LEGENDS MINIMUM SYSTEM REQUIREMENTS :\n" +
                    "\n" +
                    "OS: 64-bit Windows 7.\n" +
                    "CPU: Intel Core i3-6300 3.8GHz / AMD FX-4350 4.2 GHz Quad-Core Processor.\n" +
                    "RAM: 6GB.\n" +
                    "GPU: NVIDIA GeForce GT 640 / Radeon HD 7730.\n" +
                    "GPU RAM: 1 GB.\n" +
                    "HARD DRIVE: Minimum 22 GB of free space.",

            "MINIMUM:\n" +
                    "\n" +
                    "OS: Windows Vista (SP2), Windows 7 (SP1) or Windows 8 (Please note that we only support 64 bit OSs.)\n" +
                    "Processor: Intel Core 2 Quad Q8400 @ 2.66Ghz or AMD Phenom II X4 940 @ 3.0Ghz\n" +
                    "Memory: 6 GB RAM\n" +
                    "Graphics: DirectX 11 graphics card with 1 GB Video RAM - Nvidia Geforce GTX 460 or AMD Radeon HD 5770\n" +
                    "DirectX: Version 11\n" +
                    "Storage: 25 GB available space\n" +
                    "Sound Card: DirectX 9.0c Compatible Sound Card with Latest Drivers"
    };

    public static int logogame []={
            R.drawable.pubg,
            R.drawable.r6,
            R.drawable.dota2,
            R.drawable.codw,
            R.drawable.apex,
            R.drawable.watchdog
    };

    static ArrayList <GameLogo> GetListData(){
    ArrayList<GameLogo> list = new ArrayList<>();
    for (int position = 0; position < gameName.length;position++){
        GameLogo gameLogo = new GameLogo();
        gameLogo.setName(gameName[position]);
        gameLogo.setDetail(Detail[position]);
        gameLogo.setSpec(Spec[position]);
        gameLogo.setLogogame(logogame[position]);
        list.add(gameLogo);
    }
    return list;
    }
}
