package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.danigelabert.leccion5.DataBinderMapperImpl());
  }
}
