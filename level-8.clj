:level-8 {:english {:level-title "Level 8"
                    :paragraph-1 (str "Human " applicant-name ", oftentimes it will be beneficial to parameterize queries to allow reuse with different variables. For example, in the query below $ is bound to db, and ?worker-id is bound to the UUID. The $ has been implicit in the previous queries and is most commonly used only when providing additional inputs. ")
                    :paragraph-2 "(d/q '[:find (pull ?e [:farm/_workers])\n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]] db #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\")"
                    :paragraph-3 "Modify the query to use the author-id as an input to the query in order to retrieve information about the specific author."
                    :paragraph-4 "You may now continue to level 9."}
          :portuguese {:level-title ""
                       :paragraph-1 (str "" applicant-name "$ db ?worker-id UUID. $")
                       :paragraph-2 "(d/q '[:find (pull ?e [:farm/_workers])\n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]] db #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\")"
                       :paragraph-3 "author-id"
                       :paragraph-4 ""}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name "$ db ?worker-id UUID. $")
                    :paragraph-2 "(d/q '[:find (pull ?e [:farm/_workers])\n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]] db #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\")"
                    :paragraph-3 "author-id"
                    :paragraph-4 ""}}
