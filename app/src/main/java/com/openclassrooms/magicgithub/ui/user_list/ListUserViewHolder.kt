package com.openclassrooms.magicgithub.ui.user_list

import android.graphics.Color
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.openclassrooms.magicgithub.model.User

class ListUserViewHolder(private val binding: ItemListUserBinding) : RecyclerView.ViewHolder(binding.root) {
    // FOR DESIGN ---
    fun bind(user: User, callback: UserListAdapter.Listener) {
        binding.apply {
            // Mise à jour du background selon le statut
            root.setBackgroundColor(if (user.isActive) Color.WHITE else Color.rgb(255, 200, 200))

            // Chargement de l'image
            Glide.with(itemView.context)
                .load(user.avatarUrl)
                .apply(
                    RequestOptions()
                        .circleCrop()
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(itemListUserAvatar)

            // Configuration du texte et du bouton
            itemListUserUsername.text = user.login
            itemListUserDeleteButton.setOnClickListener { callback.onClickDelete(user) }
        }
    }
}