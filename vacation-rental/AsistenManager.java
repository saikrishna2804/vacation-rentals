package com.company.Interface;

public class AsistenManager implements Pegawai{

    @Override
    public int getGaji() {
        return 200000 * 20;
    }

    @Override
    public int getHonorLembur(int jamLembur) {
        return jamLembur * 40000;
    }

    @Override
    public void kerja(String posisi) {
        System.out.println("Bekerja dengan posisi sebagai " + posisi);
    }

}
