package course1.task5;

class GifReaderFactory extends ImageReaderFactory {
    @Override
    public ImageReader createImageReader() {
        return new GifReader();
    }
}
