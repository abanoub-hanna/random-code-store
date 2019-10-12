InputStream inputStream = getContentResolver().openInputStream(imageUri);
Bitmap bmp = BitmapFactory.decodeStream(inputStream);
