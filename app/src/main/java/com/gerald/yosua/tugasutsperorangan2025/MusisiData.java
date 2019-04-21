package com.gerald.yosua.tugasutsperorangan2025;

import java.util.ArrayList;

public class MusisiData {
    public static String[][] data = new String[][]{
            {
                    "Elvis Presley",
                    "Musisi yang terkenal dengan musik bergenre Blues, Pop, dan Rock&Roll",
                    "http://images4.fanpop.com/image/photos/22300000/Elvis-Presley-elvis-presley-22316492-1212-1737.jpg",
                    "Elvis Aaron Presley lahir di Tupelo, Mississippi, Amerika Serikat yang merupakan salah satu musisi paling berpengaruh dan terselebrasi pada abad ke-20. Sukses secara komersial dalam beberapa genre, termasuk pop, blues dan gospel, ia adalah salah satu artis solo dengan penjualan terbaik dalam sejarah musik rekaman, dengan perkiraan penjualan rekaman sekitar 600 juta unit di seluruh dunia.",
                    "8 Januari 1935",
                    "16 Agustus 1977 "
            },

            {
                    "Michael Jackson",
                    "Musisi yang terkenal dengan musik bergenre Pop dan juga R&B",
                    "http://images4.fanpop.com/image/photos/19600000/Michael-Jackson-michael-jackson-19665848-1000-1280.jpg",
                    "Michael Jackson lahir di Gary, Indiana, Amerika Serikat yang merupakan penyanyi dan penulis lagu. Ia terkenal sebagai the King of Pop dan memopulerkan gerakan dansa Moonwalk yang telah menjadi ciri khasnya. Albumnya yang dirilis pada tahun 1982, Thriller, adalah album terlaris di dunia, dengan penjualan melebihi 104 juta kopi di seluruh dunia.",
                    "29 Agustus 1958",
                    "25 Juni 2009"
            },

            {
                    "Ludwig van Beethoven",
                    "Musisi yang terkenal dengan musik klasik",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6f/Beethoven.jpg",
                    "Ludwig van Beethoven adalah seorang komponis musik klasik dari Jerman. Karyanya yang terkenal adalah simfoni ke-lima dan ke-sembilan, dan juga lagu piano Für Elise. Ia dipandang sebagai salah satu komponis yang terbesar dan merupakan tokoh penting dalam masa peralihan antara Zaman Klasik dan Zaman Romantik.",
                    "Desember 1770",
                    "26 Maret 1827"
            },

            {
                    "John Lennon",
                    "Musisi yang terkenal dengan musik bergenre Pop, Rock dan eksperimental",
                    "http://beatlephotoblog.com/photos/2011/10/1229.jpg",
                    "John Lennon adalah  penyanyi, pencipta lagu, instrumentalis, penulis, dan aktivis politik yang lahir di Liverpool, Inggris, danterkenal di seluruh dunia sebagai pemimpin dari The Beatles. Lennon dan Paul McCartney membentuk partnership pencipta lagu yang paling sukses dan berhasil hingga saat ini. Lennon dengan sinismenya dan McCartney dengan optimismenya melengkapi satu sama lain dengan sangat baik.",
                    "9 Oktober 1940",
                    "8 Desember 1980"
            },

            {
                    "Freddie Mercury",
                    "Musisi yang terkenal dengan musik bergenre Rock",
                    "http://images5.fanpop.com/image/photos/31700000/Freddie-freddie-mercury-31742985-970-1382.jpg",
                    "seorang penyanyi-penulis lagu dan produser rekaman dan vokalis utama dari band rock Queen berkebangsaan Inggris yang lahir Farrokh Bulsara. Dia dianggap sebagai salah satu dari penyanyi terbaik dalam sejarah musik populer,dan Mercury menulis banyak hit untuk Queen, seperti Bohemian Rhapsody, Don't Stop Me Now, dan We Are the Champions.",
                    "5 September 1946",
                    "24 November 1991 "
            },

            {
                    "James Brown",
                    "Musisi yang terkenal dengan musik Funk, Soul, dan Blues",
                    "https://i.pinimg.com/originals/db/64/a4/db64a40039c81a9fd0810b7a2e98165a.jpg",
                    "Jsmes Brown yang lahir di Barnwell, South Carolina dan juga menjuluki dirinya Godfather of Soul. ia juga merekam single Papa’s Got a Brand New Bag, yang menduduki puncak tangga-tangga lagu R&B selama delapan minggu dan masuk Top Ten untuk lagu-lagu pop. I Got You (I Feel Good), yang juga dirilis pada 1965, berada di nomor tiga dalam Top Ten.",
                    "3 Mei 1933",
                    "25 Desember 2006"
            },

            {
                    "Bob Marley",
                    "Musisi yang terkenal dengan musik Reggae, Ska, dan Rocksteady",
                    "http://66.media.tumblr.com/e9a85aee94b578260f09724c278582be/tumblr_n0af8tjMHx1sshnzbo1_1280.jpg",
                    "Robert Nesta Marley adalah seorang penyanyi, pencipta lagu, dan musisi reggae yang lahir di Nine Mile, Saint Ann, Jamaika. Bob Marley sampai saat ini dikenal di seluruh dunia sebagai musisi reggae yang paling tersohor dalam dunia musik reggae.",
                    "6 Februari 1945",
                    "11 Mei 1981"
            },


    };

    public static ArrayList<Musisi> getListDAta() {
        Musisi musisi = null;
        ArrayList<Musisi> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            musisi = new Musisi();
            musisi.setName(data[i][0]);
            musisi.setDetail(data[i][1]);
            musisi.setFoto(data[i][2]);
            musisi.setDetail2(data[i][3]);
            musisi.setLahir(data[i][4]);
            musisi.setWafat(data[i][5]);

            list.add(musisi);

        }
        return list;

    }

}
