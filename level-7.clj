:level-7 {:english {:level-title "Level 7"
                    :paragraph-1 (str "Human " applicant-name ", currently the query returns the :db/id for the book entities that reference the :author/id
                                                              of the author entity being queried. Pull supports making nested selections of information about entities. Using the syntax ")
                    :paragraph-1.1 "{:parent/attr [:nested-attr1 :nested-attr2]}"
                    :paragraph-1.2 " as a pattern in the pull expression will return the values of :nested-attr1 and :nested-attr2 instead of the :db/id for :parent/attr"
                    :paragraph-2 "Modify the query to return the values for "
                    :paragraph-2.1 ":book/name "
                    :paragraph-2.2 "and "
                    :paragraph-2.3 ":book/publication-date "
                    :paragraph-2.4 "instead of the :db/id of the book entities."
                    :paragraph-3 "You may now continue to level 8."}
          :portuguese {:level-title ""
                       :paragraph-1 (str "" applicant-name ":db/id :author/id")
                       :paragraph-1.1 "{:parent/attr [:nested-attr1 :nested-attr2]}"
                       :paragraph-1.2 " :nested-attr1  :nested-attr2 :db/id :parent/attr"
                       :paragraph-2 ""
                       :paragraph-2.1 ":book/name "
                       :paragraph-2.2 ""
                       :paragraph-2.3 ":book/publication-date "
                       :paragraph-2.4 ":db/id "
                       :paragraph-3 ""}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name ":db/id :author/id")
                    :paragraph-1.1 "{:parent/attr [:nested-attr1 :nested-attr2]}"
                    :paragraph-1.2 " :nested-attr1  :nested-attr2 :db/id :parent/attr"
                    :paragraph-2 ""
                    :paragraph-2.1 ":book/name "
                    :paragraph-2.2 ""
                    :paragraph-2.3 ":book/publication-date "
                    :paragraph-2.4 ":db/id "
                    :paragraph-3 ""}}
