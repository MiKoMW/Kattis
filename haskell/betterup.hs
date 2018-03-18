k :: String -> Double
k line = let xs =  (filter (>-0) (map read$words line))
         in  (fromIntegral$sum xs) / (fromIntegral$length xs)

solve :: String -> String
solve text = let (h:ls:a) = lines text
             in  show$k$ls

main :: IO ()
main = interact solve