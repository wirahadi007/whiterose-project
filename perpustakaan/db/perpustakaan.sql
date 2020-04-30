-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 30, 2020 at 02:33 PM
-- Server version: 10.4.12-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `daftar`
--

CREATE TABLE `daftar` (
  `nis` int(5) NOT NULL,
  `nama` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis_kelamin` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jurusan` varchar(4) COLLATE utf8mb4_unicode_ci NOT NULL,
  `alamat` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `daftar`
--

INSERT INTO `daftar` (`nis`, `nama`, `jenis_kelamin`, `jurusan`, `alamat`) VALUES
(1925, 'Aisyah', 'perempuan', 'AKL', 'Banyubiru'),
(12345, 'AHMAD FARID', 'laki-laki', 'RPL', 'NEGARA');

-- --------------------------------------------------------

--
-- Table structure for table `data_buku`
--

CREATE TABLE `data_buku` (
  `kd_buku` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jdl_buku` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pengarang` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `penerbit` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tahun` int(6) NOT NULL,
  `kategori` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hrg` int(6) NOT NULL,
  `tanggal_inventaris` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `data_buku`
--

INSERT INTO `data_buku` (`kd_buku`, `jdl_buku`, `pengarang`, `penerbit`, `tahun`, `kategori`, `hrg`, `tanggal_inventaris`) VALUES
('B0001', 'System Basis Data', 'Fathansyah', 'ITB press', 2013, 'Buku Teks', 30000, '2018-03-01'),
('B0002', 'System Basis Data', 'Abdul Kadir', 'Andi Offset', 2013, 'Buku Teks', 40000, '2018-06-01'),
('B0003', 'Propet Muhammad', 'Amir Abdulah', 'Masdina Press', 2014, 'Biografi', 45000, '2018-04-01'),
('B0004', 'PemrogramanBasisData', 'Abdul Kadir', 'Andi Offset', 2018, 'Buku Teks', 67000, '2018-02-01'),
('B0005', 'KetikaCintaBertasbih', 'Habibburahman ES', 'Masdina Press', 2014, 'fiksi', 75000, '2018-02-01'),
('B0006', 'Harry Poter', 'JK Rowling', 'Brithis Press', 2013, 'Fiksi', 50000, '2018-03-01');

-- --------------------------------------------------------

--
-- Table structure for table `kembali`
--

CREATE TABLE `kembali` (
  `kode_buku` int(5) NOT NULL,
  `nama` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis_buk` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `judul` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pengarang` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tgl_kem` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `peminjam`
--

CREATE TABLE `peminjam` (
  `kode_buku` int(5) NOT NULL,
  `nama` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `jenis` varchar(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `judul_buk` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `pengarang` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `peminjam`
--

INSERT INTO `peminjam` (`kode_buku`, `nama`, `jenis`, `judul_buk`, `pengarang`) VALUES
(1, 'agil', 'sastra', 'bokunopico', 'kakek legend'),
(123, 'ahmad farid', 'umum', 'kasih ibu', 'nirwanto'),
(6789, 'Aisyah', 'sastra', 'Surat Cinta', 'Nurman');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(8) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin12');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `daftar`
--
ALTER TABLE `daftar`
  ADD PRIMARY KEY (`nis`);

--
-- Indexes for table `data_buku`
--
ALTER TABLE `data_buku`
  ADD PRIMARY KEY (`kd_buku`);

--
-- Indexes for table `kembali`
--
ALTER TABLE `kembali`
  ADD PRIMARY KEY (`kode_buku`);

--
-- Indexes for table `peminjam`
--
ALTER TABLE `peminjam`
  ADD PRIMARY KEY (`kode_buku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
