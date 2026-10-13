# Quản Lý và Khôi Phục Các Phân Đoạn Gói (Split APKs)

Ứng dụng gốc được phân phối theo mô hình **Dynamic Delivery (Android App Bundle)** gồm 1 Base APK và 3 Split APKs:

```
Stream-Deck-origin-source/
└── recovered/
    ├── resources/
    │   ├── base/           [Tài nguyên giao diện từ com.corsair.android.streamdeck.apk]
    │   ├── split_en/       [Tài nguyên chuỗi đa ngôn ngữ tiếng Anh từ config.en.apk]
    │   └── split_mdpi/     [Tài nguyên hình ảnh raster MDPI từ config.mdpi.apk]
    ├── native-libraries/
    │   ├── arm64-v8a/      [Tập hợp 9 thư viện .so từ config.arm64_v8a.apk]
    │   └── symbols/        [Bảng export symbols và dynamic headers trích xuất qua nm/readelf]
    └── manifest/
        └── splits/         [Manifest con của từng split module]
```

## 1. `config.arm64_v8a.apk` (Kiến trúc vi xử lý)
Chứa toàn bộ mã thực thi cấp thấp C/C++ cho chip ARM 64-bit:
- Động cơ cốt lõi: `libvsd2-android.so`
- Động cơ mã hóa: `libsodium.so`
- Động cơ quét QR ML Kit: `libbarhopper_v3.so`
- Lớp bảo vệ chữ ký: `libpairipcore.so`
- Báo cáo sự cố: `libsentry.so`

## 2. `config.en.apk` (Ngôn ngữ)
Chứa bảng chuỗi dịch thuật mặc định tiếng Anh `values-en/strings.xml` giúp tách rời dung lượng gói tải về cho các quốc gia khác nhau.

## 3. `config.mdpi.apk` (Mật độ màn hình)
Chứa các asset hình ảnh 1x (MDPI) tương thích với độ phân giải chuẩn, tối ưu hóa kích thước cài đặt ban đầu.
