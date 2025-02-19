# QA Automation - Pengujian Kalkulator BMI

## Deskripsi
Proyek ini bertujuan untuk mengotomatisasi pengujian fitur perhitungan BMI pada aplikasi menggunakan TestNG dan Cucumber. Pengujian ini memastikan bahwa perhitungan BMI menghasilkan nilai yang akurat dan kategori yang sesuai berdasarkan data yang diberikan.

## Teknologi yang Digunakan
- TestNG
- Cucumber
- Gherkin
- Selenium WebDriver
- Java
- Maven
- ExtentReports

## Instalasi
1. Clone repositori:
   ```sh
   git clone 
   ```
2. Masuk ke direktori proyek:
   ```sh
   cd (nama folder atau repo yang di clone)
   ```
3. Pastikan Maven telah terinstal.
4. Jalankan perintah berikut untuk mengunduh dependensi:
   ```sh
   mvn clean install
   ```

## Test Case

### Feature: Kalkulator BMI

#### Scenario: Menghitung BMI dengan data valid
1. **Given** saya mengisi field berat badan dengan 70 kg
2. **And** saya mengisi field tinggi badan dengan 1.75 m
3. **When** saya menekan tombol Hitung BMI
4. **Then** saya mendapatkan hasil BMI 22.86
5. **And** saya mendapatkan kategori "Normal"

## Cara Menjalankan Pengujian
1. Pastikan semua dependensi telah terinstal dengan menjalankan:
   ```sh
   mvn clean install
   ```
2. Jalankan pengujian dengan perintah:
   ```sh
   mvn test
   ```

## Hasil Pengujian
Setelah menjalankan pengujian, laporan hasil dapat ditemukan di folder `target/surefire-reports/` atau di `target/extent-reports/` jika menggunakan ExtentReports.

## Kontribusi
1. Fork repositori ini.
2. Buat branch baru (`feature/nama_fitur`).
3. Commit perubahan (`git commit -m 'Menambahkan fitur X'`).
4. Push ke branch baru (`git push origin feature/nama_fitur`).
5. Ajukan pull request.

