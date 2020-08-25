package im.vector.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import im.vector.R
import kotlinx.android.synthetic.main.fragment_home_individual.*

class InviteRoomFragment: BaseNewHomeIndividualFragment() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_home_individual
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        sectionView.setPlaceholders(null, getString(R.string.no_result_placeholder))
        sectionView.setupRoomRecyclerView(LinearLayoutManager(activity, RecyclerView.VERTICAL, false),
                R.layout.adapter_item_room_invite, false, onSelectRoomListener, invitationListener, moreActionListener)
        sectionView.setRooms(localRooms)
    }
}