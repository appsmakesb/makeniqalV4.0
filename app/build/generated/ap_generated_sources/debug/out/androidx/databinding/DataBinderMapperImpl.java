package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.v4android.usserapp.DataBinderMapperImpl());
  }
}
