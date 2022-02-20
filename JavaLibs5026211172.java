import javax.swing.JOptionPane;

public class JavaLibs5026211172 {
    public static void main(String[] args) {

        int opsi = JOptionPane.showConfirmDialog(null, "Selamat datang di program vaksinasi puskesma Sukorame Kota Kediri" +
                "sebelum melaksanakan vaksinasi anda harus melewati proses screening" +
                "apakah anda bersedia menjawab semua pertanyaan yang akan kami berikan?", "Konfirmasi Kebersediaan", JOptionPane.YES_NO_OPTION);

        String nama;
        nama = JOptionPane.showInputDialog("Siapa nama anda ?");

        double usia;
        usia = Double.parseDouble(JOptionPane.showInputDialog("Berapa usia anda. Contoh : 2.5 tahun"));

        long nik;
        nik = Long.parseLong(JOptionPane.showInputDialog("NIK"));

        int poin = 0;

        int Pertanyaan1 = JOptionPane.showConfirmDialog(null,
                "Apakah pernah terkonfirmasi menderita Covid-19 ?",
                "Pertanyaan ke 1",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan1 == JOptionPane.YES_OPTION){
            poin +=1;
        }

        int Pertanyaan2 = JOptionPane.showConfirmDialog(null,
                "Apakah sedang hamil atau menyusui ?",
                "Pertanyaan ke 2",
                JOptionPane.YES_NO_OPTION);
        if  (Pertanyaan2 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan3 = JOptionPane.showConfirmDialog(null,
                "Apakah mengalami gejala ISPA dalam tujuh hari terakhir ?",
                "Pertanyaan ke 3",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan3 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan4 = JOptionPane.showConfirmDialog(null,
                "Apakah dalam 5 hari terakhir pernah kontak erat dengan penderita COVID 19?",
                "Pertanyaan ke 4",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan4 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan5 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda sedang mendapatkan terapi aktif jangka panjang terhadap penyakit kelainan darah?",
                "Pertanyaan ke 5",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan5 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan6 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit jantung (gagal jantung/penyakit jantung coroner)?",
                "Pertanyaan ke 6",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan6 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan7 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit Autoimun Sistemik (SLE/Lupus, Sjogren, vaskulitis, dan autoimun lainnya)?",
                "Pertanyaan ke 7",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan7 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan8 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit ginjal? (penyakit ginjal kronis/sedang menjalani hemodialysis/dialysis peritoneal/transplantasi ginjal/sindroma nefrotik dengan kortikosteroid)",
                "Pertanyaan ke 8",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan8 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan9 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit Reumatik Autoimun/Rhematoid Arthritis?",
                "Pertanyaan ke 9",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan9 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan10 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit saluran pencernaan kronis?",
                "Pertanyaan ke 10",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan10 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan11 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit Hipertiroid/hipotiroid karena autoimun?",
                "Pertanyaan ke 11",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan11 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan12 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit kanker, kelainan darah, imunokompromais/defisiensi imun, dan penerima produk darah/transfusi?",
                "Pertanyaan ke 12",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan12 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan13 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita penyakit Diabetes Melitus?",
                "Pertanyaan ke 13",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan13 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan14 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda menderita HIV?",
                "Pertanyaan ke 14",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan14 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        int Pertanyaan15 = JOptionPane.showConfirmDialog(null,
                "Apakah Anda memiliki penyakit paru (asma, PPOK, TBC)?",
                "Pertanyaan ke 15",
                JOptionPane.YES_NO_OPTION);
        if (Pertanyaan15 == JOptionPane.YES_NO_OPTION){
            poin +=1;
        }

        String keputusan;

        keputusan = null;

        if (poin == 15){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        } else if (poin == 14){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 13){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 12){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 11){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 10){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 9){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 8){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 7){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 6){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 5){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 4){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 3){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }else if (poin == 2) {
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 1){
            keputusan = "Mohon maaf anda belum bisa mengikuti program vaksinasi COVID 19 kali ini";
        }
        else if (poin == 0){
            keputusan = "Selamat anda dapat mengikuti program vaksinasi COVID 19, sini saya suntik !!!";
        }

        JOptionPane.showMessageDialog(null, "Halo "+nama+"Berdasarkan hasil screening tersebut maka,"+keputusan);

    }
}