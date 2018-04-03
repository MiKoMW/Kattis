printLN :: [[String]] -> String
printLN [] = ""
printLN (x:xs) = (printLN xs) ++ a ++ " " ++ b ++ "\n" 
      where (a:b:c) = x      

k :: [[String]] -> [[String]] -> [[String]]
k rank  [] = [
k rank  (x:xs) | (length rank == 12) = rank
               | elem (head x) (map head rank) = k rank xs
               | otherwise = k (x:rank) xs
               

solve :: String -> String
solve text = let l:ls = map words$lines$text
             in printLN$k [] ls

main :: IO ()
main = interact solve