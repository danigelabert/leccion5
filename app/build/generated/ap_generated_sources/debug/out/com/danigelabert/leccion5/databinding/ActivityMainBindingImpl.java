package com.danigelabert.leccion5.databinding;
import com.danigelabert.leccion5.R;
import com.danigelabert.leccion5.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cost_of_service, 1);
        sViewsWithIds.put(R.id.service_question, 2);
        sViewsWithIds.put(R.id.tip_options, 3);
        sViewsWithIds.put(R.id.option_twenty_percent, 4);
        sViewsWithIds.put(R.id.option_eighteen_percent, 5);
        sViewsWithIds.put(R.id.option_fifteen_percent, 6);
        sViewsWithIds.put(R.id.round_up_switch, 7);
        sViewsWithIds.put(R.id.calculate_button, 8);
        sViewsWithIds.put(R.id.tip_result, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.EditText) bindings[1]
            , (android.widget.RadioButton) bindings[5]
            , (android.widget.RadioButton) bindings[6]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.Switch) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RadioGroup) bindings[3]
            , (android.widget.TextView) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}